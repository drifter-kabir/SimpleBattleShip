public class SimpleBattleShip {
    int[] locations=new int[7];
    int gues,cnt=0;
    public void setLocations(int[] ar){
        locations=ar;
    }
    String makeGuess(int x){
        gues=x;
        int ck=0;
        for(int i=0;i<7;i++){
            if(locations[i]==gues){
                ck=1;
                locations[i]=-1;
                cnt++;
                break;
            }
        }
        if(ck==0){
            System.out.println("Miss "+(7-cnt)+" BattleShip(s) Left");
        }
        else{
            if(cnt==7){
                System.out.println("Hit, All BattleShips are Destroyed".toUpperCase());
                return "YES";
            }
            System.out.println("Hit "+(7-cnt)+" BattleShip(s) Left");
        }
        if(cnt==7){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}

