.class public final Ly3/e8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private final b:Ly3/h8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ly3/h8;->n:Ly3/h8;

    iput-object v0, p0, Ly3/e8;->b:Ly3/h8;

    return-void
.end method


# virtual methods
.method public final a(I)Ly3/e8;
    .locals 0

    iput p1, p0, Ly3/e8;->a:I

    return-object p0
.end method

.method public final b()Ly3/i8;
    .locals 3

    new-instance v0, Ly3/d8;

    iget v1, p0, Ly3/e8;->a:I

    iget-object v2, p0, Ly3/e8;->b:Ly3/h8;

    invoke-direct {v0, v1, v2}, Ly3/d8;-><init>(ILy3/h8;)V

    return-object v0
.end method
