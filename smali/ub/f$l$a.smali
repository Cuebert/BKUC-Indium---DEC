.class Lub/f$l$a;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/f$l;->e(ZIILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Lub/i;

.field final synthetic p:Lub/f$l;


# direct methods
.method varargs constructor <init>(Lub/f$l;Ljava/lang/String;[Ljava/lang/Object;Lub/i;)V
    .locals 0

    iput-object p1, p0, Lub/f$l$a;->p:Lub/f$l;

    iput-object p4, p0, Lub/f$l$a;->o:Lub/i;

    invoke-direct {p0, p2, p3}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lub/f$l$a;->p:Lub/f$l;

    iget-object v0, v0, Lub/f$l;->p:Lub/f;

    iget-object v0, v0, Lub/f;->o:Lub/f$j;

    iget-object v1, p0, Lub/f$l$a;->o:Lub/i;

    invoke-virtual {v0, v1}, Lub/f$j;->c(Lub/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v1

    const/4 v2, 0x4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Http2Connection.Listener failure for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lub/f$l$a;->p:Lub/f$l;

    iget-object v4, v4, Lub/f$l;->p:Lub/f;

    iget-object v4, v4, Lub/f;->q:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lwb/f;->t(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    :try_start_1
    iget-object v1, p0, Lub/f$l$a;->o:Lub/i;

    sget-object v2, Lub/b;->p:Lub/b;

    invoke-virtual {v1, v2, v0}, Lub/i;->d(Lub/b;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    return-void
.end method
