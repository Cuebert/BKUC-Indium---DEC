.class public final Lr5/h;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private final n:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lr5/h;->n:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lr5/h;->n:I

    return v0
.end method
