.class final Lub/f$k;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "k"
.end annotation


# instance fields
.field final o:Z

.field final p:I

.field final q:I

.field final synthetic r:Lub/f;


# direct methods
.method constructor <init>(Lub/f;ZII)V
    .locals 2

    .line 1
    iput-object p1, p0, Lub/f$k;->r:Lub/f;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lub/f;->q:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s ping %08x%08x"

    invoke-direct {p0, p1, v0}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    iput-boolean p2, p0, Lub/f$k;->o:Z

    .line 4
    iput p3, p0, Lub/f$k;->p:I

    .line 5
    iput p4, p0, Lub/f$k;->q:I

    return-void
.end method


# virtual methods
.method public k()V
    .locals 4

    iget-object v0, p0, Lub/f$k;->r:Lub/f;

    iget-boolean v1, p0, Lub/f$k;->o:Z

    iget v2, p0, Lub/f$k;->p:I

    iget v3, p0, Lub/f$k;->q:I

    invoke-virtual {v0, v1, v2, v3}, Lub/f;->C0(ZII)V

    return-void
.end method
