public class SimulationManager {
    public void runSimulation(int totalTicks){
        for(int tick=1;tick <= totalTicks ; tick++){
            System.out.println();
            System.out.println("Tick " + tick + " started.");
            distributeServices();
            distributeUtilities();
            if(tick > 1 )  {
                distributePreviousProduction();
            }else{
                System.out.println("Step 3 skipped first tick is warm - up ");
            }
            updateZones();

            collectProduction();
            System.out.println("\nTick " + tick + " is over!!!");
        }

    }


    public void distributeServices(){
        System.out.println("\nServices are distributed!");
    }
    public void distributeUtilities(){
        System.out.println("Utilities are distributed!");
    }
    public void distributePreviousProduction(){
        System.out.println("Previous producitons are distributed");
    }
    public void updateZones(){
        System.out.println("Zones upgraded");
    }
    public void collectProduction(){
        System.out.println("Collected");

    }

}
