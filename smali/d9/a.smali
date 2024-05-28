.class public abstract Ld9/a;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field protected n:Ljava/lang/String;

.field protected o:Landroid/content/Context;

.field private p:Ljava/lang/String;

.field private q:I

.field private r:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 2
    iput-object p2, p0, Ld9/a;->o:Landroid/content/Context;

    .line 3
    iput-object p1, p0, Ld9/a;->n:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Ld9/a;->p:Ljava/lang/String;

    .line 5
    iput p4, p0, Ld9/a;->q:I

    .line 6
    iput p5, p0, Ld9/a;->r:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld9/a;->p:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ld9/a;->r:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ld9/a;->q:I

    return v0
.end method
