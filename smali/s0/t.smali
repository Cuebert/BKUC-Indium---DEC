.class public final Ls0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/t$a;,
        Ls0/t$b;
    }
.end annotation


# static fields
.field public static final f:Ls0/t$b;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls0/n;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:Landroid/content/ComponentName;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls0/t$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls0/t$b;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Ls0/t;->f:Ls0/t$b;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ls0/n;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Landroid/content/ComponentName;",
            "Z)V"
        }
    .end annotation

    const-string v0, "credentialOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls0/t;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Ls0/t;->b:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Ls0/t;->c:Z

    .line 5
    iput-object p4, p0, Ls0/t;->d:Landroid/content/ComponentName;

    .line 6
    iput-boolean p5, p0, Ls0/t;->e:Z

    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "credentialOptions should not be empty"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls0/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ls0/t;->a:Ljava/util/List;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/t;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ls0/t;->c:Z

    return v0
.end method

.method public final d()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Ls0/t;->d:Landroid/content/ComponentName;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Ls0/t;->e:Z

    return v0
.end method
