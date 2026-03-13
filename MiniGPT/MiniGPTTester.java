public class MiniGPTTester {
    public static void main(String[] args) {
        MiniGPT miniG = new MiniGPT("thegreatgatsby.txt", 6);
        miniG.generateText("knockoffgatsby", 10000);
    }
}
