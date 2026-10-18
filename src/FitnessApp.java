public class FitnessApp {
    public static void main(String[] args) {
        // Client interacts with the Additional Facade for locations
        LocationFacade locationFacade = new LocationFacade();
        locationFacade.selectLeftBankBranch();

        System.out.println();

        // Client interacts with the Main Facade for booking
        FitnessFacade fitnessFacade = new FitnessFacade();

        int memberId = 101;
        int workoutId = 5;

        fitnessFacade.bookWorkout(memberId, workoutId);
    }
}