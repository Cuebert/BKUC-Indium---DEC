.class public Ly5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly5/a;


# static fields
.field private static a:Ly5/b;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Ly5/b;
    .locals 1

    .line 1
    sget-object v0, Ly5/b;->a:Ly5/b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ly5/b;

    invoke-direct {v0}, Ly5/b;-><init>()V

    sput-object v0, Ly5/b;->a:Ly5/b;

    .line 3
    :cond_0
    sget-object v0, Ly5/b;->a:Ly5/b;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
