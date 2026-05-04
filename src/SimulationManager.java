public class SimulationManager {
    public void runSimulation(int totalTicks , char[][] cityMap){
        for(int tick=1;tick <= totalTicks ; tick++){
            System.out.println();
            System.out.println("Tick " + tick + " started.");

            System.out.println("City Map currently :");
            printMap(cityMap);
            System.out.println();

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
        System.out.println("Previous productions are distributed");
    }
    public void updateZones(){
        System.out.println("Zones upgraded");
    }
    public void collectProduction(){
        System.out.println("Collected");

    }
    public void printMap(char[][] map){
        for (int i = 0 ; i< map.length ; i++){
            for (int j = 0; j< map[i].length; j++ ){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}
