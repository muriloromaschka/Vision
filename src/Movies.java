
public class Movies {

	private String title;
    private String release;
    private String genre;
    private String director;

     Movies()
     
     {
    	 
     
     title="";
     release="";
     genre="";
     director="";
     
     }
    
    
     //return the title
   
    public String getTitle() {
        return title;
    }

    
     //title to set
    
    public void setTitle(String title) {
        this.title = title;
    }

   
    //return the release
     
    public String getRelease() {
        return release;
    }

    
     //release to set
    
    public void setRelease(String release) {
        this.release = release;
    }

 
     //return the genre
     
    public String getGenre() {
        return genre;
    }

    
    // genre to set
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    
     //return the director
  
    public String getDirector() {
        return director;
    }

   
     // director to set
     
    public void setDirector(String director) {
        this.director = director;
}
    
}
