.class public final Lz2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/accounts/Account;

.field private b:Lh0/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/b<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ld4/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ld4/a;->w:Ld4/a;

    iput-object v0, p0, Lz2/b$a;->e:Ld4/a;

    return-void
.end method


# virtual methods
.method public a()Lz2/b;
    .locals 11

    new-instance v10, Lz2/b;

    iget-object v1, p0, Lz2/b$a;->a:Landroid/accounts/Account;

    iget-object v2, p0, Lz2/b$a;->b:Lh0/b;

    iget-object v6, p0, Lz2/b$a;->c:Ljava/lang/String;

    iget-object v7, p0, Lz2/b$a;->d:Ljava/lang/String;

    iget-object v8, p0, Lz2/b$a;->e:Ld4/a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lz2/b;-><init>(Landroid/accounts/Account;Ljava/util/Set;Ljava/util/Map;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Ld4/a;Z)V

    return-object v10
.end method

.method public b(Ljava/lang/String;)Lz2/b$a;
    .locals 0

    iput-object p1, p0, Lz2/b$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/util/Collection;)Lz2/b$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)",
            "Lz2/b$a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lz2/b$a;->b:Lh0/b;

    if-nez v0, :cond_0

    new-instance v0, Lh0/b;

    invoke-direct {v0}, Lh0/b;-><init>()V

    iput-object v0, p0, Lz2/b$a;->b:Lh0/b;

    :cond_0
    iget-object v0, p0, Lz2/b$a;->b:Lh0/b;

    .line 2
    invoke-virtual {v0, p1}, Lh0/b;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final d(Landroid/accounts/Account;)Lz2/b$a;
    .locals 0

    iput-object p1, p0, Lz2/b$a;->a:Landroid/accounts/Account;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lz2/b$a;
    .locals 0

    iput-object p1, p0, Lz2/b$a;->d:Ljava/lang/String;

    return-object p0
.end method
