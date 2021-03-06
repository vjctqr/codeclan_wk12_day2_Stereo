public class Stereo extends Component implements IPlayCD, IPlayRecord {

    private String stereoName;
    private String cdName;
    private String recordName;

    public Stereo(String stereoName) {
        this.stereoName = stereoName;
        this.cdName = cdName;
        this.recordName = recordName;
    }

    public String getStereoName() {
        return stereoName;
    }

    public void setStereoName(String stereoName) {
        this.stereoName = stereoName;
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String playCD() {
        return "I'm a Stereo playing "+cdName;
    }

    public String playRecord() {
        return "I'm a Stereo spinning "+recordName;
    }


}
