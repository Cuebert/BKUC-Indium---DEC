.class public final Lkb/b1$c;
.super Lmb/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/b1;->j(Ljava/lang/Object;Lkb/e1;Lkb/a1;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lkb/b1;

.field final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmb/o;Lkb/b1;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lkb/b1$c;->d:Lkb/b1;

    iput-object p3, p0, Lkb/b1$c;->e:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lmb/o$a;-><init>(Lmb/o;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmb/o;

    invoke-virtual {p0, p1}, Lkb/b1$c;->f(Lmb/o;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lmb/o;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, Lkb/b1$c;->d:Lkb/b1;

    invoke-virtual {p1}, Lkb/b1;->F()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lkb/b1$c;->e:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    .line 2
    :cond_1
    invoke-static {}, Lmb/n;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method
