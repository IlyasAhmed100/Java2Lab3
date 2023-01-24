public class Participant {
    private String participantID;
    private String dateDataCollection;
    private String timeDataCollection;
    private int heartRateAverage;

    public Participant(String participantID, String dateDataCollection, String timeDataCollection, int heartRateAverage) {
        setParticipantID(participantID);
        setDateDataCollection(dateDataCollection);
        setTimeDataCollection(timeDataCollection);
        setHeartRateAverage(heartRateAverage);
    }

    
    /** 
     * @param patricipantID
     */
    public void setParticipantID(String patricipantID) {
        this.participantID = patricipantID;
    }

    
    /** 
     * @param dateDataCollection
     */
    public void setDateDataCollection(String dateDataCollection) {
        this.dateDataCollection = dateDataCollection;
    }

    
    /** 
     * @param timeDataCollection
     */
    public void setTimeDataCollection(String timeDataCollection) {
        this.timeDataCollection = timeDataCollection;
    }

    
    /** 
     * @param heartRateAverage
     */
    public void setHeartRateAverage(int heartRateAverage) {
        this.heartRateAverage = heartRateAverage;
    }
    
    
    /** 
     * @return String
     */
    public String getParticipantID() {
        return participantID;
    }

    
    /** 
     * @return String
     */
    public String getDateDataCollection() {
        return dateDataCollection;
    }

    
    /** 
     * @return String
     */
    public String getTimeDataCollection() {
        return timeDataCollection;
    }

    
    /** 
     * @return int
     */
    public int getHeartRateAverage() {
        return heartRateAverage;
    }
    
    
    
    /** 
     * @return String
     */
    public String toString() {
        return String.format("%s\t\t\t%s\t\t\t%s\t\t\t%d", participantID, dateDataCollection, timeDataCollection, heartRateAverage);
    }



    
}