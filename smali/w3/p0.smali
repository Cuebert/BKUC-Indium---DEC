.class final Lw3/p0;
.super Lw3/f0;
.source "SourceFile"


# instance fields
.field private final n:Ljava/lang/Object;
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation
.end field

.field private o:I

.field final synthetic p:Lw3/r0;


# direct methods
.method constructor <init>(Lw3/r0;I)V
    .locals 0

    iput-object p1, p0, Lw3/p0;->p:Lw3/r0;

    invoke-direct {p0}, Lw3/f0;-><init>()V

    iget-object p1, p1, Lw3/r0;->p:[Ljava/lang/Object;

    aget-object p1, p1, p2

    iput-object p1, p0, Lw3/p0;->n:Ljava/lang/Object;

    iput p2, p0, Lw3/p0;->o:I

    return-void
.end method

.method private final a()V
    .locals 3

    iget v0, p0, Lw3/p0;->o:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lw3/p0;->p:Lw3/r0;

    .line 1
    invoke-virtual {v1}, Lw3/r0;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lw3/p0;->n:Ljava/lang/Object;

    iget-object v1, p0, Lw3/p0;->p:Lw3/r0;

    iget-object v1, v1, Lw3/r0;->p:[Ljava/lang/Object;

    iget v2, p0, Lw3/p0;->o:I

    aget-object v1, v1, v2

    .line 2
    invoke-static {v0, v1}, Lw3/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lw3/p0;->p:Lw3/r0;

    iget-object v1, p0, Lw3/p0;->n:Ljava/lang/Object;

    .line 3
    invoke-static {v0, v1}, Lw3/r0;->b(Lw3/r0;Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lw3/p0;->o:I

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    iget-object v0, p0, Lw3/p0;->n:Ljava/lang/Object;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    iget-object v0, p0, Lw3/p0;->p:Lw3/r0;

    .line 1
    invoke-virtual {v0}, Lw3/r0;->j()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw3/p0;->n:Ljava/lang/Object;

    .line 2
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-direct {p0}, Lw3/p0;->a()V

    iget v0, p0, Lw3/p0;->o:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v1, p0, Lw3/p0;->p:Lw3/r0;

    iget-object v1, v1, Lw3/r0;->q:[Ljava/lang/Object;

    .line 4
    aget-object v0, v1, v0

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lw3/p0;->p:Lw3/r0;

    .line 1
    invoke-virtual {v0}, Lw3/r0;->j()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw3/p0;->n:Ljava/lang/Object;

    .line 2
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-direct {p0}, Lw3/p0;->a()V

    iget v0, p0, Lw3/p0;->o:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lw3/p0;->p:Lw3/r0;

    iget-object v1, p0, Lw3/p0;->n:Ljava/lang/Object;

    .line 4
    invoke-virtual {v0, v1, p1}, Lw3/r0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v1, p0, Lw3/p0;->p:Lw3/r0;

    iget-object v1, v1, Lw3/r0;->q:[Ljava/lang/Object;

    .line 5
    aget-object v2, v1, v0

    .line 6
    aput-object p1, v1, v0

    return-object v2
.end method
