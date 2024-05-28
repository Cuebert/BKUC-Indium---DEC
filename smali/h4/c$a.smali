.class public final Lh4/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Landroid/net/Uri;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lh4/c$a;->a:Ljava/lang/String;

    iput-object v0, p0, Lh4/c$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lh4/c;
    .locals 9

    new-instance v8, Lh4/c;

    iget-object v1, p0, Lh4/c$a;->a:Ljava/lang/String;

    iget-object v2, p0, Lh4/c$a;->b:Ljava/lang/String;

    iget-object v3, p0, Lh4/c$a;->c:Ljava/lang/String;

    iget-object v4, p0, Lh4/c$a;->d:Ljava/lang/String;

    iget-object v5, p0, Lh4/c$a;->e:Ljava/lang/String;

    iget-object v6, p0, Lh4/c$a;->f:Landroid/net/Uri;

    iget-object v7, p0, Lh4/c$a;->g:Ljava/lang/String;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lh4/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    return-object v8
.end method

.method public final b(Ljava/lang/String;)Lh4/c$a;
    .locals 0

    iput-object p1, p0, Lh4/c$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lh4/c$a;
    .locals 0

    iput-object p1, p0, Lh4/c$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lh4/c$a;
    .locals 0

    iput-object p1, p0, Lh4/c$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lh4/c$a;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh4/c$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final f(Ljava/lang/String;)Lh4/c$a;
    .locals 1

    const-string v0, "idToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh4/c$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final g(Ljava/lang/String;)Lh4/c$a;
    .locals 0

    iput-object p1, p0, Lh4/c$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public final h(Landroid/net/Uri;)Lh4/c$a;
    .locals 0

    iput-object p1, p0, Lh4/c$a;->f:Landroid/net/Uri;

    return-object p0
.end method
