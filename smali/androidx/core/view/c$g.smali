.class final Landroidx/core/view/c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/c$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field private final a:Landroid/content/ClipData;

.field private final b:I

.field private final c:I

.field private final d:Landroid/net/Uri;

.field private final e:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Landroidx/core/view/c$d;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Landroidx/core/view/c$d;->a:Landroid/content/ClipData;

    invoke-static {v0}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipData;

    iput-object v0, p0, Landroidx/core/view/c$g;->a:Landroid/content/ClipData;

    .line 3
    iget v0, p1, Landroidx/core/view/c$d;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x5

    const-string v3, "source"

    invoke-static {v0, v1, v2, v3}, Landroidx/core/util/h;->c(IIILjava/lang/String;)I

    move-result v0

    iput v0, p0, Landroidx/core/view/c$g;->b:I

    .line 4
    iget v0, p1, Landroidx/core/view/c$d;->c:I

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/core/util/h;->e(II)I

    move-result v0

    iput v0, p0, Landroidx/core/view/c$g;->c:I

    .line 5
    iget-object v0, p1, Landroidx/core/view/c$d;->d:Landroid/net/Uri;

    iput-object v0, p0, Landroidx/core/view/c$g;->d:Landroid/net/Uri;

    .line 6
    iget-object p1, p1, Landroidx/core/view/c$d;->e:Landroid/os/Bundle;

    iput-object p1, p0, Landroidx/core/view/c$g;->e:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/c$g;->a:Landroid/content/ClipData;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Landroidx/core/view/c$g;->c:I

    return v0
.end method

.method public c()Landroid/view/ContentInfo;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Landroidx/core/view/c$g;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentInfoCompat{clip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/core/view/c$g;->a:Landroid/content/ClipData;

    .line 2
    invoke-virtual {v1}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/core/view/c$g;->b:I

    .line 3
    invoke-static {v1}, Landroidx/core/view/c;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/core/view/c$g;->c:I

    .line 4
    invoke-static {v1}, Landroidx/core/view/c;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    iget-object v1, p0, Landroidx/core/view/c$g;->d:Landroid/net/Uri;

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ", hasLinkUri("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/core/view/c$g;->d:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    iget-object v1, p0, Landroidx/core/view/c$g;->e:Landroid/os/Bundle;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, ", hasExtras"

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
