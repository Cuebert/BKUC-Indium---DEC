package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceStackFrame;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class SourceCode {

    @SerializedName("path")
    public String sourceCodeFileName;

    @SerializedName("startLine")
    public Integer startLine;

    public SourceCode(BacktraceStackFrame backtraceStackFrame) {
        this.sourceCodeFileName = backtraceStackFrame.sourceCodeFileName;
        this.startLine = backtraceStackFrame.line;
    }
}
