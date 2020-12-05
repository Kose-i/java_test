interface Player {
  int StartPosition = 0; // public static final
  int EndPosition   = 10;
  void play();
  void stop();
}

class VideoPlayer implements Player {
  @Override public void play() {
    System.out.println("play");
  }
  @Override public void stop() {
    System.out.println("stop");
  }
}

class InterfaceDemo {
  public static void main(String[] Args) {
    VideoPlayer x = new VideoPlayer();

    x.play();
    x.stop();
  }
}
