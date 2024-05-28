.class abstract Ltb/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "b"
.end annotation


# instance fields
.field protected final n:Lac/i;

.field protected o:Z

.field final synthetic p:Ltb/a;


# direct methods
.method private constructor <init>(Ltb/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ltb/a$b;->p:Ltb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lac/i;

    invoke-static {p1}, Ltb/a;->n(Ltb/a;)Lac/e;

    move-result-object p1

    invoke-interface {p1}, Lac/t;->f()Lac/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lac/i;-><init>(Lac/u;)V

    iput-object v0, p0, Ltb/a$b;->n:Lac/i;

    return-void
.end method

.method synthetic constructor <init>(Ltb/a;Ltb/a$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ltb/a$b;-><init>(Ltb/a;)V

    return-void
.end method


# virtual methods
.method public V(Lac/c;J)J
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Ltb/a$b;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->n(Ltb/a;)Lac/e;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lac/t;->V(Lac/c;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    .line 2
    iget-object p2, p0, Ltb/a$b;->p:Ltb/a;

    invoke-static {p2}, Ltb/a;->o(Ltb/a;)Lrb/e;

    move-result-object p2

    invoke-virtual {p2}, Lrb/e;->q()V

    .line 3
    invoke-virtual {p0}, Ltb/a$b;->b()V

    .line 4
    throw p1
.end method

.method final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ltb/a$b;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->l(Ltb/a;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Ltb/a$b;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->l(Ltb/a;)I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    .line 3
    iget-object v0, p0, Ltb/a$b;->p:Ltb/a;

    iget-object v2, p0, Ltb/a$b;->n:Lac/i;

    invoke-static {v0, v2}, Ltb/a;->k(Ltb/a;Lac/i;)V

    .line 4
    iget-object v0, p0, Ltb/a$b;->p:Ltb/a;

    invoke-static {v0, v1}, Ltb/a;->m(Ltb/a;I)I

    return-void

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ltb/a$b;->p:Ltb/a;

    invoke-static {v2}, Ltb/a;->l(Ltb/a;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()Lac/u;
    .locals 1

    iget-object v0, p0, Ltb/a$b;->n:Lac/i;

    return-object v0
.end method
