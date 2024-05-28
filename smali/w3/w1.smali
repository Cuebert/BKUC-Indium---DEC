.class public final Lw3/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private final b:Lw3/z1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lw3/z1;->n:Lw3/z1;

    iput-object v0, p0, Lw3/w1;->b:Lw3/z1;

    return-void
.end method


# virtual methods
.method public final a(I)Lw3/w1;
    .locals 0

    iput p1, p0, Lw3/w1;->a:I

    return-object p0
.end method

.method public final b()Lw3/b2;
    .locals 3

    new-instance v0, Lw3/v1;

    iget v1, p0, Lw3/w1;->a:I

    iget-object v2, p0, Lw3/w1;->b:Lw3/z1;

    invoke-direct {v0, v1, v2}, Lw3/v1;-><init>(ILw3/z1;)V

    return-object v0
.end method
