.class final Ltb/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field private final n:Lac/i;

.field private o:Z

.field final synthetic p:Ltb/a;


# direct methods
.method private constructor <init>(Ltb/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ltb/a$f;->p:Ltb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lac/i;

    invoke-static {p1}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object p1

    invoke-interface {p1}, Lac/s;->f()Lac/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lac/i;-><init>(Lac/u;)V

    iput-object v0, p0, Ltb/a$f;->n:Lac/i;

    return-void
.end method

.method synthetic constructor <init>(Ltb/a;Ltb/a$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ltb/a$f;-><init>(Ltb/a;)V

    return-void
.end method


# virtual methods
.method public C(Lac/c;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Ltb/a$f;->o:Z

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lac/c;->y0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lpb/e;->f(JJJ)V

    .line 3
    iget-object v0, p0, Ltb/a$f;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lac/s;->C(Lac/c;J)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Ltb/a$f;->o:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ltb/a$f;->o:Z

    .line 3
    iget-object v0, p0, Ltb/a$f;->p:Ltb/a;

    iget-object v1, p0, Ltb/a$f;->n:Lac/i;

    invoke-static {v0, v1}, Ltb/a;->k(Ltb/a;Lac/i;)V

    .line 4
    iget-object v0, p0, Ltb/a$f;->p:Ltb/a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ltb/a;->m(Ltb/a;I)I

    return-void
.end method

.method public f()Lac/u;
    .locals 1

    iget-object v0, p0, Ltb/a$f;->n:Lac/i;

    return-object v0
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Ltb/a$f;->o:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Ltb/a$f;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object v0

    invoke-interface {v0}, Lac/d;->flush()V

    return-void
.end method
