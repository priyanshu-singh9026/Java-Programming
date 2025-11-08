import java.util.*;

public class F1_Logistics {
    static class Race {
        int x, y, day;
        Race(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Race[] races = new Race[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int day = sc.nextInt();
            races[i] = new Race(x, y, day);
        }

       
        
        Arrays.sort(races, (a, b) -> a.day - b.day);

       
        
        List<Race> cars = new ArrayList<>();

        for (Race r : races) {
            boolean assigned = false;

            for (Race car : cars) {
                int distance = Math.abs(r.x - car.x) + Math.abs(r.y - car.y);
                int daysDiff = r.day - car.day;

                if (daysDiff >= distance && r.day != car.day) {
                  
                    
                    car.x = r.x;
                    car.y = r.y;
                    car.day = r.day;
                    assigned = true;
                    break;
                }
            }

           
            
            if (!assigned) {
                cars.add(new Race(r.x, r.y, r.day));
            }
        }

        System.out.println(cars.size());
        sc.close();
    }
}
