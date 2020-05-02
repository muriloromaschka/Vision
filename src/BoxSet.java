
public class BoxSet {

	private String title;
    private String release ;
    private String director;

     BoxSet()
     
     {
    
    title="";
    release="" ;
    director="";

     }
     // return the title
     
     public String getTitle() {
         return title;
     }
         //title to set
     
         public void setTitle(String title) {
             this.title = title;
}
         //return the realease
         
         public String getRelease() {
            return release;
         }

         
        //release to set
          
         public void setRelease(String release) {
             this.release = release;
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
