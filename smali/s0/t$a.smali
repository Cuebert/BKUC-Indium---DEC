.class public final Ls0/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls0/n;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Z

.field private e:Landroid/content/ComponentName;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ls0/t$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Ls0/n;)Ls0/t$a;
    .locals 1

    const-string v0, "credentialOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls0/t$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b()Ls0/t;
    .locals 7

    .line 1
    new-instance v6, Ls0/t;

    .line 2
    iget-object v0, p0, Ls0/t$a;->a:Ljava/util/List;

    invoke-static {v0}, Lua/k;->j(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 3
    iget-object v2, p0, Ls0/t$a;->b:Ljava/lang/String;

    .line 4
    iget-boolean v3, p0, Ls0/t$a;->c:Z

    .line 5
    iget-object v4, p0, Ls0/t$a;->e:Landroid/content/ComponentName;

    .line 6
    iget-boolean v5, p0, Ls0/t$a;->d:Z

    move-object v0, v6

    .line 7
    invoke-direct/range {v0 .. v5}, Ls0/t;-><init>(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V

    return-object v6
.end method
