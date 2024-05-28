.class final Lgc/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgc/s$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:Lob/z;

.field final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lob/y;

.field private final f:Lob/b0;

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private final j:[Lgc/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lgc/p<",
            "*>;"
        }
    .end annotation
.end field

.field final k:Z


# direct methods
.method constructor <init>(Lgc/s$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lgc/s$a;->b:Ljava/lang/reflect/Method;

    iput-object v0, p0, Lgc/s;->a:Ljava/lang/reflect/Method;

    .line 3
    iget-object v0, p1, Lgc/s$a;->a:Lgc/u;

    iget-object v0, v0, Lgc/u;->c:Lob/z;

    iput-object v0, p0, Lgc/s;->b:Lob/z;

    .line 4
    iget-object v0, p1, Lgc/s$a;->n:Ljava/lang/String;

    iput-object v0, p0, Lgc/s;->c:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lgc/s$a;->r:Ljava/lang/String;

    iput-object v0, p0, Lgc/s;->d:Ljava/lang/String;

    .line 6
    iget-object v0, p1, Lgc/s$a;->s:Lob/y;

    iput-object v0, p0, Lgc/s;->e:Lob/y;

    .line 7
    iget-object v0, p1, Lgc/s$a;->t:Lob/b0;

    iput-object v0, p0, Lgc/s;->f:Lob/b0;

    .line 8
    iget-boolean v0, p1, Lgc/s$a;->o:Z

    iput-boolean v0, p0, Lgc/s;->g:Z

    .line 9
    iget-boolean v0, p1, Lgc/s$a;->p:Z

    iput-boolean v0, p0, Lgc/s;->h:Z

    .line 10
    iget-boolean v0, p1, Lgc/s$a;->q:Z

    iput-boolean v0, p0, Lgc/s;->i:Z

    .line 11
    iget-object v0, p1, Lgc/s$a;->v:[Lgc/p;

    iput-object v0, p0, Lgc/s;->j:[Lgc/p;

    .line 12
    iget-boolean p1, p1, Lgc/s$a;->w:Z

    iput-boolean p1, p0, Lgc/s;->k:Z

    return-void
.end method

.method static b(Lgc/u;Ljava/lang/reflect/Method;)Lgc/s;
    .locals 1

    new-instance v0, Lgc/s$a;

    invoke-direct {v0, p0, p1}, Lgc/s$a;-><init>(Lgc/u;Ljava/lang/reflect/Method;)V

    invoke-virtual {v0}, Lgc/s$a;->b()Lgc/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method a([Ljava/lang/Object;)Lob/g0;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgc/s;->j:[Lgc/p;

    .line 2
    array-length v1, p1

    .line 3
    array-length v2, v0

    if-ne v1, v2, :cond_2

    .line 4
    new-instance v2, Lgc/r;

    iget-object v4, p0, Lgc/s;->c:Ljava/lang/String;

    iget-object v5, p0, Lgc/s;->b:Lob/z;

    iget-object v6, p0, Lgc/s;->d:Ljava/lang/String;

    iget-object v7, p0, Lgc/s;->e:Lob/y;

    iget-object v8, p0, Lgc/s;->f:Lob/b0;

    iget-boolean v9, p0, Lgc/s;->g:Z

    iget-boolean v10, p0, Lgc/s;->h:Z

    iget-boolean v11, p0, Lgc/s;->i:Z

    move-object v3, v2

    invoke-direct/range {v3 .. v11}, Lgc/r;-><init>(Ljava/lang/String;Lob/z;Ljava/lang/String;Lob/y;Lob/b0;ZZZ)V

    .line 5
    iget-boolean v3, p0, Lgc/s;->k:Z

    if-eqz v3, :cond_0

    add-int/lit8 v1, v1, -0x1

    .line 6
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    .line 7
    aget-object v5, p1, v4

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    aget-object v5, v0, v4

    aget-object v6, p1, v4

    invoke-virtual {v5, v2, v6}, Lgc/p;->a(Lgc/r;Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v2}, Lgc/r;->k()Lob/g0$a;

    move-result-object p1

    const-class v0, Lgc/l;

    new-instance v1, Lgc/l;

    iget-object v2, p0, Lgc/s;->a:Ljava/lang/reflect/Method;

    invoke-direct {v1, v2, v3}, Lgc/l;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V

    invoke-virtual {p1, v0, v1}, Lob/g0$a;->g(Ljava/lang/Class;Ljava/lang/Object;)Lob/g0$a;

    move-result-object p1

    invoke-virtual {p1}, Lob/g0$a;->a()Lob/g0;

    move-result-object p1

    return-object p1

    .line 10
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Argument count ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") doesn\'t match expected count ("

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
