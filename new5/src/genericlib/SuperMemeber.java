package genericlib;


	class Super {
	    public int index = 1;
	}

	class App extends Super {
		//int  index;
	    public App(int index) {
	        index= index++;
	    }
	}