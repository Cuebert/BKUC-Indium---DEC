.class public Lx7/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lf9/g;
    .locals 1

    new-instance v0, Lx7/b$g$a;

    invoke-direct {v0, p0}, Lx7/b$g$a;-><init>(Lx7/b$g;)V

    return-object v0
.end method
