class Process {
    int processID, burstTime, remainingTime;
    Process next;

    public Process(int processID, int burstTime) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null, tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int processID, int burstTime) {
        Process newProcess = new Process(processID, burstTime);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
        }
        tail = newProcess;
    }

    public void executeProcesses() {
        if (head == null) return;
        Process current = head;
        int time = 0;

        while (true) {
            boolean allDone = true;
            Process prev = tail;
            Process start = current;
            
            do {
                if (current.remainingTime > 0) {
                    allDone = false;
                    int execTime = Math.min(timeQuantum, current.remainingTime);
                    current.remainingTime -= execTime;
                    time += execTime;
                    System.out.println("Process " + current.processID + " executed for " + execTime + " units. Remaining: " + current.remainingTime);
                }
                prev = current;
                current = current.next;
            } while (current != start);
            
            if (allDone) break;
        }
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);
        scheduler.addProcess(1, 10);
        scheduler.addProcess(2, 5);
        scheduler.addProcess(3, 8);
        
        scheduler.executeProcesses();
    }
}
