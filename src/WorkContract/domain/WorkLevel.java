package WorkContract.domain;

public enum WorkLevel {
    JUNIOR( "Junior"),
    MID_LEVEL( "Mid Level"),
    SENIOR( "Senior");



    private final String levelName;

    WorkLevel( String levelName) {

        this.levelName = levelName;
    }

    public String getLevelName() {
        return levelName;
    }
}

