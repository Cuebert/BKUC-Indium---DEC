.class Lub/f$b;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/f;->F0(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:I

.field final synthetic p:J

.field final synthetic q:Lub/f;


# direct methods
.method varargs constructor <init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;IJ)V
    .locals 0

    iput-object p1, p0, Lub/f$b;->q:Lub/f;

    iput p4, p0, Lub/f$b;->o:I

    iput-wide p5, p0, Lub/f$b;->p:J

    invoke-direct {p0, p2, p3}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lub/f$b;->q:Lub/f;

    iget-object v0, v0, Lub/f;->J:Lub/j;

    iget v1, p0, Lub/f$b;->o:I

    iget-wide v2, p0, Lub/f$b;->p:J

    invoke-virtual {v0, v1, v2, v3}, Lub/j;->e0(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, p0, Lub/f$b;->q:Lub/f;

    invoke-static {v1, v0}, Lub/f;->b(Lub/f;Ljava/io/IOException;)V

    :goto_0
    return-void
.end method
