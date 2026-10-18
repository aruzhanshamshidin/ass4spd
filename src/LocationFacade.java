public class LocationFacade {
    private BranchSystem branchSystem;

    public LocationFacade() {
        this.branchSystem = new BranchSystem();
    }

    public void selectLeftBankBranch() {
        System.out.println("Selected Left Bank branch (Mangilik el street).");
        branchSystem.getBranchInfo("Left Bank");
    }

    public void selectRightBankBranch() {
        System.out.println("Selected Right Bank branch (Beibitshilik street).");
        branchSystem.getBranchInfo("Right Bank");
    }
}
