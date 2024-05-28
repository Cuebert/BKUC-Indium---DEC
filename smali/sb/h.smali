.class public final Lsb/h;
.super Lob/j0;
.source "SourceFile"


# instance fields
.field private final o:Ljava/lang/String;

.field private final p:J

.field private final q:Lac/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLac/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lob/j0;-><init>()V

    .line 2
    iput-object p1, p0, Lsb/h;->o:Ljava/lang/String;

    .line 3
    iput-wide p2, p0, Lsb/h;->p:J

    .line 4
    iput-object p4, p0, Lsb/h;->q:Lac/e;

    return-void
.end method


# virtual methods
.method public Q()Lac/e;
    .locals 1

    iget-object v0, p0, Lsb/h;->q:Lac/e;

    return-object v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lsb/h;->p:J

    return-wide v0
.end method

.method public l()Lob/b0;
    .locals 1

    iget-object v0, p0, Lsb/h;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lob/b0;->d(Ljava/lang/String;)Lob/b0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
