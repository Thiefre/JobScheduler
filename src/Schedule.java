import java.util.ArrayList;

public class Schedule 
{
	ArrayList<Job> jobs = new ArrayList<Job>();
	
	public Schedule()
	{
		
	}
	
	public Job insert(int time)
	{
		Job j = new Job(time);
		jobs.add(j);
		return j;
	}
	
	public Job get(int index)
	{
		return jobs.get(index);
	}
	
	public int finish()
	{
		
		return 0;
	}
	
	public class Job
	{
		int time;
		Job prereq;
		
		private Job(int time)
		{
			this.time = time;
		}
		
		public void requires(Job j)
		{
			this.prereq = j;
		}
		
		public int start()
		{
			if(prereq != null)
			{
				time += prereq.start();
			}
			return time;
		}
	}
}
