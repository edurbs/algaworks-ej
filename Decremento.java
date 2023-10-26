public class Decremento {
	public static void main (String[] args){
		int countDownloads = 0;
		int newCountDownloads = ++countDownloads; // countDownloads++ would be 0
		
		System.out.println("Count Downloads " + countDownloads);
		System.out.println("New Count Downloadas " + newCountDownloads);
	}
}