import java.util.Scanner;
class AcmIcpcTeam{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxTopicTeamKnow = 0;
        int countTeamThatKnowMaxTopic = 0;

        String arr[] = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int numTopicTeamKnow = 0;
                for(int k = 0; k < m; k++){
                    int topic1 = Character.getNumericValue(arr[i].charAt(k));
                    int topic2 = Character.getNumericValue(arr[j].charAt(k));
                    if(topic1 + topic2 == 1 || topic1 + topic2 == 2){
                        numTopicTeamKnow++;
                    }
                }
                if(maxTopicTeamKnow < numTopicTeamKnow){
                    maxTopicTeamKnow = numTopicTeamKnow;
                }
            }
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int numTopicTeamKnow = 0;
                for(int k = 0; k < m; k++){
                    int topic1 = Character.getNumericValue(arr[i].charAt(k));
                    int topic2 = Character.getNumericValue(arr[j].charAt(k));
                    if(topic1 + topic2 == 1 || topic1 + topic2 == 2){
                        numTopicTeamKnow++;
                    }
                }
                if(maxTopicTeamKnow == numTopicTeamKnow){
                    countTeamThatKnowMaxTopic++;
                }
            }
        }
        System.out.println(maxTopicTeamKnow);
        System.out.println(countTeamThatKnowMaxTopic);


    }
}