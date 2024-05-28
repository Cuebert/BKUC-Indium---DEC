.class Lqb/d$c$a;
.super Lqb/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqb/d$c;->d(I)Lac/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic p:Lqb/d$c;


# direct methods
.method constructor <init>(Lqb/d$c;Lac/s;)V
    .locals 0

    iput-object p1, p0, Lqb/d$c$a;->p:Lqb/d$c;

    invoke-direct {p0, p2}, Lqb/e;-><init>(Lac/s;)V

    return-void
.end method


# virtual methods
.method protected b(Ljava/io/IOException;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lqb/d$c$a;->p:Lqb/d$c;

    iget-object p1, p1, Lqb/d$c;->d:Lqb/d;

    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p0, Lqb/d$c$a;->p:Lqb/d$c;

    invoke-virtual {v0}, Lqb/d$c;->c()V

    .line 3
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
