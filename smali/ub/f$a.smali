.class Lub/f$a;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/f;->E0(ILub/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:I

.field final synthetic p:Lub/b;

.field final synthetic q:Lub/f;


# direct methods
.method varargs constructor <init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;ILub/b;)V
    .locals 0

    iput-object p1, p0, Lub/f$a;->q:Lub/f;

    iput p4, p0, Lub/f$a;->o:I

    iput-object p5, p0, Lub/f$a;->p:Lub/b;

    invoke-direct {p0, p2, p3}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lub/f$a;->q:Lub/f;

    iget v1, p0, Lub/f$a;->o:I

    iget-object v2, p0, Lub/f$a;->p:Lub/b;

    invoke-virtual {v0, v1, v2}, Lub/f;->D0(ILub/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, p0, Lub/f$a;->q:Lub/f;

    invoke-static {v1, v0}, Lub/f;->b(Lub/f;Ljava/io/IOException;)V

    :goto_0
    return-void
.end method
