.class Lob/e$b$a;
.super Lac/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lob/e$b;-><init>(Lob/e;Lqb/d$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Lob/e;

.field final synthetic p:Lqb/d$c;

.field final synthetic q:Lob/e$b;


# direct methods
.method constructor <init>(Lob/e$b;Lac/s;Lob/e;Lqb/d$c;)V
    .locals 0

    iput-object p1, p0, Lob/e$b$a;->q:Lob/e$b;

    iput-object p3, p0, Lob/e$b$a;->o:Lob/e;

    iput-object p4, p0, Lob/e$b$a;->p:Lqb/d$c;

    invoke-direct {p0, p2}, Lac/g;-><init>(Lac/s;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lob/e$b$a;->q:Lob/e$b;

    iget-object v0, v0, Lob/e$b;->e:Lob/e;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lob/e$b$a;->q:Lob/e$b;

    iget-boolean v2, v1, Lob/e$b;->d:Z

    if-eqz v2, :cond_0

    .line 3
    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 4
    iput-boolean v2, v1, Lob/e$b;->d:Z

    .line 5
    iget-object v1, v1, Lob/e$b;->e:Lob/e;

    iget v3, v1, Lob/e;->p:I

    add-int/2addr v3, v2

    iput v3, v1, Lob/e;->p:I

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-super {p0}, Lac/g;->close()V

    .line 8
    iget-object v0, p0, Lob/e$b$a;->p:Lqb/d$c;

    invoke-virtual {v0}, Lqb/d$c;->b()V

    return-void

    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
