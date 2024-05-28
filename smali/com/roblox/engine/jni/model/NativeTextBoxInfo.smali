.class public Lcom/roblox/engine/jni/model/NativeTextBoxInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public font:I

.field public fontSize:F

.field public height:F

.field public manualFocusRelease:Z

.field public multiline:Z

.field public returnKeyType:I

.field public textColor:I

.field public textInputType:I

.field public width:F

.field public x:F

.field public xAlignment:I

.field public y:F

.field public yAlignment:I


# direct methods
.method public constructor <init>(FFFFFZIIIIIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    .line 3
    iput p2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    .line 4
    iput p3, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    .line 5
    iput p4, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    .line 6
    iput p5, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    .line 7
    iput-boolean p6, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->multiline:Z

    .line 8
    iput p7, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    .line 9
    iput p8, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    .line 10
    iput p9, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textColor:I

    .line 11
    iput p10, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    .line 12
    iput p11, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    .line 13
    iput p12, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->returnKeyType:I

    .line 14
    iput-boolean p13, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->manualFocusRelease:Z

    return-void
.end method

.method public constructor <init>(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    .line 17
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    .line 18
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    .line 19
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    .line 20
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    .line 21
    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->multiline:Z

    iput-boolean v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->multiline:Z

    .line 22
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    .line 23
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    .line 24
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textColor:I

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textColor:I

    .line 25
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    .line 26
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    .line 27
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->returnKeyType:I

    iput v0, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->returnKeyType:I

    .line 28
    iget-boolean p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->manualFocusRelease:Z

    iput-boolean p1, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->manualFocusRelease:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    if-eqz v1, :cond_1

    .line 2
    check-cast p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    .line 3
    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    iget-boolean v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->multiline:Z

    iget-boolean v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->multiline:Z

    if-ne v1, v2, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textColor:I

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textColor:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->returnKeyType:I

    iget v2, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->returnKeyType:I

    if-ne v1, v2, :cond_1

    iget-boolean p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->manualFocusRelease:Z

    iget-boolean v1, p0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->manualFocusRelease:Z

    if-ne p1, v1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
