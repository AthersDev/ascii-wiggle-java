class Wiggle{
	public static void main(String args[]){
		int i = 1, j, n = 1, mode = 0,len, maxIndent = 10, rows = 1, l ;
		String eh;
		if (args.length == 0)
			eh = "Wiggle";
		else
			eh = args[0];
		if (args.length > 1)
			len =Integer.parseInt(args[1]);
		else
			len = 50;
		if (args.length > 2)
			maxIndent = Integer.parseInt(args[2]);
		if (args.length > 3)
		{
			rows = Integer.parseInt(args[3]);
		}

		for(i =1;i<=len;i++){
			for(j=1; j<= n;j++)
				System.out.print(" ");
			for(l = 1; l <= rows; l++)
				System.out.print(eh+" ");
			System.out.println();
			if (mode == 0)
				n++;
			else
				n--;
			if (n == maxIndent)
				mode = 1;
			if (n == 1)
				mode = 0;
			try{
				Thread.sleep(50);
			}
			catch (InterruptedException e){
			}
		}
		System.out.println("			Customise: [text] [length] [maxIndent] [rows]");
	}
}
