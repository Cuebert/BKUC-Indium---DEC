.class final La2/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La2/u$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(La2/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La2/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La2/u;
    .locals 3

    .line 1
    iget-object v0, p0, La2/e$b;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lc2/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 2
    new-instance v0, La2/e;

    iget-object v1, p0, La2/e$b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La2/e;-><init>(Landroid/content/Context;La2/e$a;)V

    return-object v0
.end method

.method public bridge synthetic b(Landroid/content/Context;)La2/u$a;
    .locals 0

    invoke-virtual {p0, p1}, La2/e$b;->c(Landroid/content/Context;)La2/e$b;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;)La2/e$b;
    .locals 0

    invoke-static {p1}, Lc2/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, La2/e$b;->a:Landroid/content/Context;

    return-object p0
.end method
