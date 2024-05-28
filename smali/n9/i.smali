.class public Ln9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:Landroid/graphics/Point;

.field c:Landroid/graphics/Point;

.field d:Landroid/graphics/Point;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:Z

.field l:Z

.field m:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->f:Ljava/lang/String;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->j:Ljava/lang/String;

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 10

    .line 1
    iget-boolean v0, p0, Ln9/i;->m:Z

    if-eqz v0, :cond_0

    const-string v0, "VR"

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Ln9/i;->k:Z

    if-eqz v0, :cond_1

    const-string v0, "Phone"

    goto :goto_0

    :cond_1
    const-string v0, "Tablet"

    .line 2
    :goto_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v2, 0x4

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Ln9/i;->j:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v6, p0, Ln9/i;->h:Ljava/lang/String;

    const/4 v7, 0x1

    aput-object v6, v3, v7

    iget-object v6, p0, Ln9/i;->i:Ljava/lang/String;

    const/4 v8, 0x2

    aput-object v6, v3, v8

    const/4 v6, 0x3

    aput-object v4, v3, v6

    const-string v4, "%s RobloxApp/%s (%s; %s)"

    invoke-static {v1, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xd

    new-array v4, v4, [Ljava/lang/Object;

    .line 3
    iget v9, p0, Ln9/i;->a:I

    .line 4
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v5

    iget-object v5, p0, Ln9/i;->b:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->x:I

    .line 5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v7

    iget-object v5, p0, Ln9/i;->b:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    .line 6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    iget-object v5, p0, Ln9/i;->c:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->x:I

    .line 7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    iget-object v5, p0, Ln9/i;->c:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    .line 8
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const/4 v2, 0x5

    iget-object v5, p0, Ln9/i;->d:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->x:I

    .line 9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const/4 v2, 0x6

    iget-object v5, p0, Ln9/i;->d:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    .line 10
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const/4 v2, 0x7

    iget-object v5, p0, Ln9/i;->e:Ljava/lang/String;

    .line 11
    invoke-virtual {p0, v5}, Ln9/i;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    const/16 v2, 0x8

    iget-object v5, p0, Ln9/i;->f:Ljava/lang/String;

    aput-object v5, v4, v2

    const/16 v2, 0x9

    iget-object v5, p0, Ln9/i;->g:Ljava/lang/String;

    aput-object v5, v4, v2

    const/16 v2, 0xa

    iget-object v5, p0, Ln9/i;->h:Ljava/lang/String;

    aput-object v5, v4, v2

    const/16 v2, 0xb

    aput-object v0, v4, v2

    const/16 v0, 0xc

    aput-object v3, v4, v0

    const-string v0, "Mozilla/5.0 (%dMB; %dx%d; %dx%d; %dx%d; %s; %s) %s (KHTML, like Gecko)  ROBLOX Android App %s %s Hybrid()  %s"

    .line 12
    invoke-static {v1, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 13
    iget-boolean v1, p0, Ln9/i;->l:Z

    if-eqz v1, :cond_2

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ChromeOS"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public d(Ljava/lang/String;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->e:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->i:Ljava/lang/String;

    return-object p0
.end method

.method public f(Landroid/graphics/Point;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->d:Landroid/graphics/Point;

    return-object p0
.end method

.method public g(Landroid/graphics/Point;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->c:Landroid/graphics/Point;

    return-object p0
.end method

.method public h(Z)Ln9/i;
    .locals 0

    iput-boolean p1, p0, Ln9/i;->l:Z

    return-object p0
.end method

.method public i(Z)Ln9/i;
    .locals 0

    iput-boolean p1, p0, Ln9/i;->k:Z

    return-object p0
.end method

.method public j(Z)Ln9/i;
    .locals 0

    iput-boolean p1, p0, Ln9/i;->m:Z

    return-object p0
.end method

.method public k(I)Ln9/i;
    .locals 0

    iput p1, p0, Ln9/i;->a:I

    return-object p0
.end method

.method public l(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 3
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x1f

    if-le v3, v4, :cond_1

    const/16 v4, 0x7f

    if-lt v3, v4, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    :goto_1
    const/16 v3, 0x5f

    .line 5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public m(Landroid/graphics/Point;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->b:Landroid/graphics/Point;

    return-object p0
.end method

.method public n(Ljava/lang/String;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->h:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/lang/String;)Ln9/i;
    .locals 0

    iput-object p1, p0, Ln9/i;->g:Ljava/lang/String;

    return-object p0
.end method
