.class public Li7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/c;


# instance fields
.field private captchaProvider:Ljava/lang/String;

.field private captchaToken:Ljava/lang/String;

.field private ctype:Ljava/lang/String;

.field private cvalue:Ljava/lang/String;

.field private password:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li7/d;->cvalue:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Li7/d;->ctype:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Li7/d;->password:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Li7/d;->captchaToken:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Li7/d;->captchaProvider:Ljava/lang/String;

    return-void
.end method
