class Point {
    private int x;
   private int y;

    Point() {
      //  this(0, 0);
          this.x=0;
          this.y=0;
    }


    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}