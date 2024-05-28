.class public final Lw/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/k0$a;,
        Lw/k0$b;
    }
.end annotation


# static fields
.field public static final h:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/r0;",
            ">;"
        }
    .end annotation
.end field

.field final b:Lw/o0;

.field final c:I

.field final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/h;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Z

.field private final f:Lw/j2;

.field private final g:Lw/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "camerax.core.captureConfig.rotation"

    .line 2
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/k0;->h:Lw/o0$a;

    .line 3
    const-class v0, Ljava/lang/Integer;

    const-string v1, "camerax.core.captureConfig.jpegQuality"

    .line 4
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/k0;->i:Lw/o0$a;

    return-void
.end method

.method constructor <init>(Ljava/util/List;Lw/o0;ILjava/util/List;ZLw/j2;Lw/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;",
            "Lw/o0;",
            "I",
            "Ljava/util/List<",
            "Lw/h;",
            ">;Z",
            "Lw/j2;",
            "Lw/q;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/k0;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lw/k0;->b:Lw/o0;

    .line 4
    iput p3, p0, Lw/k0;->c:I

    .line 5
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lw/k0;->d:Ljava/util/List;

    .line 6
    iput-boolean p5, p0, Lw/k0;->e:Z

    .line 7
    iput-object p6, p0, Lw/k0;->f:Lw/j2;

    .line 8
    iput-object p7, p0, Lw/k0;->g:Lw/q;

    return-void
.end method

.method public static a()Lw/k0;
    .locals 1

    new-instance v0, Lw/k0$a;

    invoke-direct {v0}, Lw/k0$a;-><init>()V

    invoke-virtual {v0}, Lw/k0$a;->h()Lw/k0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/k0;->d:Ljava/util/List;

    return-object v0
.end method

.method public c()Lw/q;
    .locals 1

    iget-object v0, p0, Lw/k0;->g:Lw/q;

    return-object v0
.end method

.method public d()Lw/o0;
    .locals 1

    iget-object v0, p0, Lw/k0;->b:Lw/o0;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/r0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/k0;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public f()Lw/j2;
    .locals 1

    iget-object v0, p0, Lw/k0;->f:Lw/j2;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lw/k0;->c:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lw/k0;->e:Z

    return v0
.end method
