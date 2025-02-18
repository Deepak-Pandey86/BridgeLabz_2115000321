import java.util.ArrayList;
import java.util.List;

// MealPlan interface
interface MealPlan {
    String getMealType();
}

// Specific Meal Plans
class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein";
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private String mealName;
    private T mealType;

    public Meal(String mealName, T mealType) {
        this.mealName = mealName;
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public T getMealType() {
        return mealType;
    }

    @Override
    public String toString() {
        return "Meal: " + mealName + " (Type: " + mealType.getMealType() + ")";
    }
}

// Meal Plan Generator
class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> meals = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }

    public void showMeals() {
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println(meal);
        }
    }

    // Generic method to validate and generate a meal plan
    public static <T extends MealPlan> Meal<T> generateMeal(String mealName, T mealType) {
        return new Meal<>(mealName, mealType);
    }
}

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = MealPlanGenerator.generateMeal("Grilled Veggie Bowl", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMeal("Tofu Stir-Fry", new VeganMeal());
        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMeal("Avocado Chicken Salad", new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = MealPlanGenerator.generateMeal("Steak & Eggs", new HighProteinMeal());

        MealPlanGenerator generator = new MealPlanGenerator();
        generator.addMeal(vegMeal);
        generator.addMeal(veganMeal);
        generator.addMeal(ketoMeal);
        generator.addMeal(proteinMeal);

        System.out.println("Personalized Meal Plans:");
        generator.showMeals();
    }
}
