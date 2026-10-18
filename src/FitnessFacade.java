public class FitnessFacade {
    private MembershipValidator membershipValidator;
    private ScheduleManager scheduleManager;
    private TrainerNotifier trainerNotifier;

    public FitnessFacade() {
        this.membershipValidator = new MembershipValidator();
        this.scheduleManager = new ScheduleManager();
        this.trainerNotifier = new TrainerNotifier();
    }

    public void bookWorkout(int memberId, int workoutId) {
        System.out.println("Starting workout booking process");

        boolean isValid = membershipValidator.validate(memberId);
        if (!isValid) {
            throw new IllegalStateException("Error: Member does not have an active membership!");
        }

        scheduleManager.bookSlot(workoutId);
        trainerNotifier.notifyTrainer(workoutId);

        System.out.println("Workout successfully booked!\n");
    }
}