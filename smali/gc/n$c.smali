.class final Lgc/n$c;
.super Lob/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final o:Lob/b0;

.field private final p:J


# direct methods
.method constructor <init>(Lob/b0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lob/j0;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/n$c;->o:Lob/b0;

    .line 3
    iput-wide p2, p0, Lgc/n$c;->p:J

    return-void
.end method


# virtual methods
.method public Q()Lac/e;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read raw response body of a converted body."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lgc/n$c;->p:J

    return-wide v0
.end method

.method public l()Lob/b0;
    .locals 1

    iget-object v0, p0, Lgc/n$c;->o:Lob/b0;

    return-object v0
.end method
