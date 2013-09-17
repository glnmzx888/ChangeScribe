package unal.edu.co.repository.git;

public class ChangedFile {
	
	
	private String path;
	private String changeType;
	private String absolutePath;
	
	public ChangedFile() {
		// TODO Auto-generated constructor stub
	}
	
	public ChangedFile(String path, String changeType, String rootPath) {
		super();
		this.path = path;
		this.changeType = changeType;
		this.absolutePath = rootPath + "/" + path;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public String getChangeType() {
		return changeType;
	}


	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	/**
     * Type changes supported by git
     * 
     * @author Beat Fluri
     */
    public static enum TypeChange {
    	ADDED("ADDED"), MODIFIED("MODIFIED"), UNTRACKED("UNTRACKED");
    	
    	private TypeChange(String type) { 
        	
        }
    }

	@Override
	public String toString() {
		return "ChangedFile [path=" + path + ", changeType=" + changeType + "]";
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}
    
    

}