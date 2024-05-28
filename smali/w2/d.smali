.class public Lw2/d;
.super Lw2/g;
.source "SourceFile"


# instance fields
.field private final o:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lw2/g;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    iput p1, p0, Lw2/d;->o:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lw2/d;->o:I

    return v0
.end method
