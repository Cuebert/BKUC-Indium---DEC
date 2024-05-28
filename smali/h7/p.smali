.class public Lh7/p;
.super Landroid/os/AsyncTask;
.source "SourceFile"

# interfaces
.implements Lh7/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lh7/j;",
        ">;",
        "Lh7/e;"
    }
.end annotation


# instance fields
.field private a:Lh7/j;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:[Lh7/b$a;

.field private e:Ljava/lang/String;

.field protected f:Lh7/m;

.field protected g:I

.field protected h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Lh7/m;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lh7/p;-><init>(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Lh7/m;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Lh7/m;Ljava/lang/String;)V
    .locals 8

    const/4 v6, -0x1

    const/4 v7, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v7}, Lh7/p;-><init>(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Lh7/m;Ljava/lang/String;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Lh7/m;Ljava/lang/String;II)V
    .locals 1

    .line 3
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lh7/p;->g:I

    .line 5
    iput v0, p0, Lh7/p;->h:I

    .line 6
    iput-object p4, p0, Lh7/p;->f:Lh7/m;

    .line 7
    iput-object p1, p0, Lh7/p;->b:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lh7/p;->c:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lh7/p;->d:[Lh7/b$a;

    .line 10
    iput-object p5, p0, Lh7/p;->e:Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p1, ""

    .line 11
    iput-object p1, p0, Lh7/p;->c:Ljava/lang/String;

    .line 12
    :cond_0
    iput p6, p0, Lh7/p;->g:I

    .line 13
    iput p7, p0, Lh7/p;->h:I

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lh7/j;
    .locals 6

    iget-object v0, p0, Lh7/p;->b:Ljava/lang/String;

    iget-object v1, p0, Lh7/p;->c:Ljava/lang/String;

    iget-object v2, p0, Lh7/p;->d:[Lh7/b$a;

    iget-object v3, p0, Lh7/p;->e:Ljava/lang/String;

    iget v4, p0, Lh7/p;->g:I

    iget v5, p0, Lh7/p;->h:I

    invoke-static/range {v0 .. v5}, Lh7/b;->l(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;II)Lh7/j;

    move-result-object p1

    iput-object p1, p0, Lh7/p;->a:Lh7/j;

    return-object p1
.end method

.method protected b(Lh7/j;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lh7/p;->f:Lh7/m;

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lh7/p;->a:Lh7/j;

    invoke-interface {p1, v0}, Lh7/m;->a(Lh7/j;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lh7/p;->a([Ljava/lang/Void;)Lh7/j;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lh7/j;

    invoke-virtual {p0, p1}, Lh7/p;->b(Lh7/j;)V

    return-void
.end method
